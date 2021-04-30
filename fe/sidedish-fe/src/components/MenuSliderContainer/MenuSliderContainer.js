import React from 'react';
import styled from 'styled-components';
import MenuSlider from './MenuSlider';

const StyledMenuSliderContainer = styled.div`
  margin-bottom: 60px;
`;

function MenuSliderContainer({ seeAll }) {
  const urls = ['http://3.36.66.115/main', 'http://3.36.66.115/soup', 'http://3.36.66.115/side'];
  const titles = ['모두가 좋아하는 든든한 메인요리', '정성이 담긴 뜨끈한 국물요리', '식탁을 풍성하게 하는 정갈한 밑반찬'];

  const renderSliders = () => {
    return seeAll ?
      urls.map((url, idx) => <MenuSlider key={idx} url={url} title={titles[idx]}/>) :
      <MenuSlider key={0} url={urls[0]} title={titles[0]}/>;
  }

  return (
    <StyledMenuSliderContainer>
      {renderSliders()}
    </StyledMenuSliderContainer>
  )
}

export default MenuSliderContainer;