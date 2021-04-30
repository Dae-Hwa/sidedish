import * as style from "./MenuCard.style.jsx"

const SmallImg = (url) => {
    return (
        <style.SmallImg url={url}/>
    )    
}

const SmallInfoTitle = (text) => {
    return (
        <style.SmallInfoTitle value={text}>
            {text}
        </style.SmallInfoTitle>
    )
}

const SmallPrice = (text) => {
    return (
        <style.SmallPrice>{text}</style.SmallPrice>
    )
}

const SmallCard = ({ imgUrl, title, price }) => {
    return(
        <style.SmallCard>
            { SmallImg(imgUrl)}
            { SmallInfoTitle(title) }
            { SmallPrice(price)}
        </style.SmallCard>
    )
}

export { SmallCard }
