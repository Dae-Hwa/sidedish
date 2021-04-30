import React from 'react';
import styled from 'styled-components';
import leftBtnSvg from '../../../rsc/svg/leftbtn.svg';
import leftBtnDisabledSvg from '../../../rsc/svg/leftbtn_disabled.svg';

const StyledLeftBtn = styled.button`
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

function LeftBtn({ style, disabled, onClick }) {
  return (
    <StyledLeftBtn style={style} disabled={disabled} onClick={onClick}>
      <img src={disabled ? leftBtnDisabledSvg : leftBtnSvg} alt="left button"/>
    </StyledLeftBtn>
  );
}

export default LeftBtn;
