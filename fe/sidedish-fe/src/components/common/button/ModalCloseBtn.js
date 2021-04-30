import React, { useState } from 'react';
import styled from 'styled-components';
import closeBtnSvg from '../../../rsc/svg/closebtn.svg';
import closeBtnHoverSvg from '../../../rsc/svg/closebtn_hover.svg';

const StyledModalCloseBtn = styled.button`
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

function ModalCloseBtn({ style, onClick }) {
  const [hover, setHover] = useState(false);

  const handleMouseOver = () => {
    setHover((hover) => !hover);
  }

  return (
    <StyledModalCloseBtn
      style={style}
      onMouseEnter={handleMouseOver}
      onMouseLeave={handleMouseOver}
      onClick={onClick}>
      <img src={hover ? closeBtnHoverSvg : closeBtnSvg} alt="modal close button"/>
    </StyledModalCloseBtn>
  );
}

export default ModalCloseBtn;
