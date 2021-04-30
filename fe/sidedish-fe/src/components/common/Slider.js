import React, { useState, useEffect, useRef, useImperativeHandle, forwardRef } from 'react';
import styled from 'styled-components';

const StyledSlider = styled.div`
  display: inline-block;
  width: 100%;
  overflow: hidden;
`;

const SliderList = styled.ul`
  width: ${props => props.width + "px"};
  display: flex;
  justify-content: space-between;
  position: relative;
  top: 0;
  left: ${props => props.positionLeft + "px"};
  transition: left 300ms linear;
`;

const SliderListItem = styled.li``;

const _calcBetweenMargin = ({ itemWidth, sliderWidth, itemCntOnView }) => {
  const totalItemWidthOnView = itemCntOnView * itemWidth;
  return (sliderWidth - totalItemWidthOnView) / (itemCntOnView - 1);
}

const _calcTotalWidth = ({ itemWidth, itemLength, betweenMargin }) => {
  return (itemWidth + betweenMargin) * itemLength - betweenMargin;
}

const _calcPositionLeft = ({ itemWidth, currIdx, betweenMargin }) => {
  return (itemWidth + betweenMargin) * currIdx * -1;
}

// TODO: default slide buttons, disable slide button

function Slider({ itemCntOnView, items, onSlide, defaultBtn = true, pageable = false }, ref) {
  const [currIdx, setCurrIdx] = useState(0);
  const [positionLeft, setPositionLeft] = useState(0);
  const [totalWidth, setTotalWidth] = useState();
  const [betweenMargin, setBetweenMargin] = useState();
  const [currPage, setCurrPage] = useState(1);
  const [totalPage] = useState(Math.ceil(items.length / itemCntOnView));

  const styledRef = useRef();
  const itemRef = useRef();
  const [sliderWidth, setSliderWidth] = useState();
  const [itemWidth, setItemWidth] = useState();

  useEffect(() => {
    setSliderWidth(styledRef.current.offsetWidth);
    setItemWidth(itemRef.current.offsetWidth);
  }, []);

  useEffect(() => {
    if (sliderWidth === undefined || itemWidth === undefined)
      return;

    const newBetweenMargin = _calcBetweenMargin({
      itemWidth,
      sliderWidth,
      itemCntOnView
    });
    const newTotalWidth = _calcTotalWidth({
      itemWidth,
      itemLength: items.length,
      betweenMargin: newBetweenMargin
    });

    setBetweenMargin(newBetweenMargin);
    setTotalWidth(newTotalWidth);
  }, [sliderWidth, itemWidth]);

  useEffect(() => {
    if (currIdx === undefined || betweenMargin === undefined)
      return;
    
    const newPositionLeft = _calcPositionLeft({
      itemWidth,
      currIdx,
      betweenMargin
    });
    setPositionLeft(newPositionLeft);
    onSlide();
  }, [currIdx, betweenMargin]);

  useImperativeHandle(ref, () => ({
    slideToLeft,
    slideToRight,
    slidableToLeft,
    slidableToRight,
    getCurrPage: () => currPage,
    getTotalPage: () => totalPage,
  }));

  const slideToLeft = () => {
    if (!slidableToLeft())
      return;

    setCurrPage(currPage - 1);

    (!pageable && currIdx % itemCntOnView) ?
      setCurrIdx(currIdx - currIdx % itemCntOnView) :
      setCurrIdx(currIdx - itemCntOnView);
  }

  const slideToRight = () => {
    if (!slidableToRight())
      return;

    setCurrPage(currPage + 1);

    (!pageable && currIdx === items.length - itemCntOnView - items.length % itemCntOnView) ?
      setCurrIdx(currIdx + items.length % itemCntOnView) :
      setCurrIdx(currIdx + itemCntOnView);
  }

  const slidableToLeft = () => {
    return currIdx !== 0;
  }

  const slidableToRight = () => {
    return currIdx < items.length - itemCntOnView;
  }

  const renderItems = () => {
    return items.slice(1).reduce((result, item, idx) => {
      return result.concat(
        <SliderListItem key={idx}>
          {item}
        </SliderListItem>);
    }, [
      <SliderListItem key={-1} ref={itemRef}>
        {items[0]}
      </SliderListItem>
    ]);
  }

  return (
    <StyledSlider ref={styledRef}>
      <SliderList
        width={totalWidth?.toString() ?? "0"}
        positionLeft={positionLeft.toString()}>
        {renderItems()}
      </SliderList>
    </StyledSlider>
  );
}

export default forwardRef(Slider);
