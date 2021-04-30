import React from 'react';
import styled from 'styled-components';
import rightBtnSvg from '../../../rsc/svg/rightbtn.svg';
import rightBtnDisabledSvg from '../../../rsc/svg/rightbtn_disabled.svg';

const StyledRightBtn = styled.button`
  padding: 0 6px;
  border: none;
  background-color: transparent;

  &:not(:disabled):hover {
    opacity: 0.7;
  }

  .img {
    pointer-events: none;
    z-index: -1;
  }
`;

function RightBtn({ style, disabled, onClick }) {
  return (
    <StyledRightBtn style={style} disabled={disabled} onClick={onClick}>
      <img src={disabled ? rightBtnDisabledSvg : rightBtnSvg} alt="right button"/>
    </StyledRightBtn>
  );
}

export default RightBtn;
