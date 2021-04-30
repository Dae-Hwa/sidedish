import styled from "styled-components";

const Card = styled.div`
    text-align:left;
    cursor: pointer;
`
const SmallCard = styled(Card)`
    width:160px;
    height:270px;
`

const MiddleCard = styled(Card)`
    width:308px;
    height:456px;
`

const LargeCard = styled(Card)`
    width:384px;
    height:540px;
`

const Img = styled.img`
    background-size: 100% 100%;
    background-repeat: no-repeat;
    background-image: url(${props => props.url});
`

const SmallImg = styled(Img)`
    width:160px;
    height:160px;
    margin-bottom: 8px;
`

const MiddleImg = styled(Img)`
    width:308px;
    height:308px;
    margin-bottom: 16px;
`

const LargeImg = styled(Img)`
    width:384px;
    height:384px;
`

const InfoTitle = styled.div`
    color: #333333;
    font-weight: normal;
`

const SmallInfoTitle = styled(InfoTitle)`
    font-size: 16px;
    line-height: 23px;
    margin-bottom: 8px;
`

const LargeInfoTitle = styled(InfoTitle)`
    font-size: 16px;
    line-height: 23px;
    margin-bottom: 8px;
`

const InfoContents = styled.div`
    width:100%;
    font-weight: normal;
    font-size: 14px;
    line-height: 20px;
    color: #828282;
`
const MiddleInfoContents = styled(InfoContents)`
    margin-bottom: 8px;
`
const LargeInfoContents = styled(InfoContents)`
    margin-bottom: 16px;
`

const LargePrice = styled.div`
    display:flex;
    flex-direction: row;
    margin-bottom: 16px;
    align-items: baseline;
    
`
const SmallPrice = styled.div`
    font-weight: bold;
    font-size: 14px;
    line-height: 20px;
`


const LargePriceBefore = styled.div`
    font-size: 14px;
    line-height: 20px;
    text-decoration-line: line-through;
    color: #BDBDBD;
`


const LargePriceAfter = styled.div`
    font-weight: bold;
    font-size: 20px;
    margin-right:16px;
    line-height: 29px;
`

const LargeSpeicalPrice = styled.div`
    display: flex;
    flex-direction: row;
    align-items: center; 
    justify-content: center;
    padding: 4px 16px;
    width: 97px;
    height: 28px;

    /* Light Blue */
    border-radius: 5px;
    /* text-align:center; */
    color:white;
    margin-right: 10px;
    font-weight: bold;
    
`
const LargeEventPrice = styled(LargeSpeicalPrice)`
    background-color : #82D32D;

`
const LargeLaunchingPrice = styled(LargeSpeicalPrice)`
    background-color : #86C6FF;;
`
const FlexRowContainer = styled.div`
    display:flex; 
    flex-direction:row;

    margin-bottom: 16px;
    align-items: baseline;
`

const HoverStyle =  styled.div` 
    opacity: 0%;
    position: absolute;
    
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;


    font-weight: bold;
    font-size: 24px;
    line-height: 35px;
    color: #FFFFFF;

    /* text-align:center; */

    top:0px;
    left:0;
    width:100%;
    height:100%;
    background: linear-gradient(0deg, rgba(0, 0, 0, 0.6), rgba(0, 0, 0, 0.6));
    :hover{
        opacity: 100%;
    }
`

const HoverContents = styled.div`
    /* display: flex; */
    /* margin:  0 auto; */
    font-weight: bold;
    font-size: 24px;
    line-height: 35px;
    color: #FFFFFF;

    text-align:center;
`

export {
    SmallCard,
    MiddleCard,
    LargeCard,
    SmallImg,
    MiddleImg,
    LargeImg,
    SmallInfoTitle,
    LargeInfoTitle,
    MiddleInfoContents,
    LargeInfoContents,
    SmallPrice,
    LargePrice,
    LargePriceBefore,
    LargePriceAfter,
    LargeSpeicalPrice,
    LargeEventPrice,
    LargeLaunchingPrice,
    FlexRowContainer,
    HoverStyle,
    HoverContents,
}