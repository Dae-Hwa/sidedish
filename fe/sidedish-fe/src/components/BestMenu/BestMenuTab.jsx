const BestMenuTab = ( props ) => {
    const Items = Object.values(props)[0]
    const renderItems = () => Items.map((v) => {
        return (
            <div key={v.cateId}></div>
        )
    })
    return (
        renderItems()
    )
}
export default BestMenuTab;