import React, { useState, useEffect, useRef } from "react";
import styled from "styled-components";
import Global from '../../util/Global.js';
import useFetchData from "../../util/hooks/useFetchData.js";
import Slider from "../common/Slider.js";
import LeftBtn from "../common/button/LeftBtn.js";
import RightBtn from "../common/button/RightBtn.js";
import { MiddleCard } from "../MenuCard/MiddleCard.jsx";
import MenuDetailModal from '../MenuDetailModal/MenuDetailModal.js';

const StyledMenuSlider = styled.div`
  width: 100%;
  margin-top: 32px;
  position: relative;

  > .title {
    margin: 32px 0;
    float: left;
    font-weight: 800;
    font-size: 24px;
    line-height: 35px;
    color: #333333;
  }
`;

const _LeftBtnStyle = {
  position: "absolute", 
  top: "60%",
  left: "-3%"
};

const _RightBtnStyle = {
  position: "absolute",
  top: "60%",
  right: "-3%"
}

function MenuSlider({ url, title }) {
  const { response } = useFetchData(url, {});
  const [showModal, setShowModal] = useState(false);
  const [modalProps, setModalProps] = useState();
  const [disableLeftBtn, setDisableLeftBtn] = useState();
  const [disableRightBtn, setDisableRightBtn] = useState();
  const sliderRef = useRef();

  const handleSlide = () => {
    setDisableLeftBtn(!sliderRef.current.slidableToLeft());
    setDisableRightBtn(!sliderRef.current.slidableToRight());
  };

  const handleClickLeftBtn = () => {
    sliderRef.current.slideToLeft();
  };

  const handleClickRightBtn = () => {
    sliderRef.current.slideToRight();
  };

  const handleClickMenuCard = (modalProps) => {
    setShowModal(true);
    setModalProps({ ...modalProps, onClickCloseBtn: handleClickCloseBtn });
  }

  const handleClickCloseBtn = () => {
    setShowModal(false);
  }

  const renderItems = () => {
    return response.map((data, idx) =>
      <MiddleCard
        key={idx}
        className="slider-item"
        data={data}
        onClick={() => handleClickMenuCard({ hash: data.detail_hash, title: data.title })}
      />
    );
  };

  return (
    <StyledMenuSlider>
      {showModal && <MenuDetailModal {...modalProps}/>}
      <div className="title">{title}</div>
      <LeftBtn
        style={_LeftBtnStyle}
        disabled={disableLeftBtn}
        onClick={handleClickLeftBtn}
      />
      <RightBtn
        style={_RightBtnStyle}
        disabled={disableRightBtn}
        onClick={handleClickRightBtn}
      />
      {response && (
        <Slider
          ref={sliderRef}
          itemCntOnView={4}
          items={renderItems()}
          onSlide={handleSlide}
          defaultBtn={false}
        />
      )}
    </StyledMenuSlider>
  );
}

export default MenuSlider;
