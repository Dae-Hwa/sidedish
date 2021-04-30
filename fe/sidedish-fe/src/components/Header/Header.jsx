
import React, { useState, useEffect } from "react";
import { BiSearch } from 'react-icons/bi';

import "./Header.css"
import DropdownNav from "./Dropdown"
import * as style from "./Header.style"
import { HeaderStatic } from "../../rsc/static/components.js"
import socialMediaAuth from "../../service/auth";
import { githubProvider, googleProvider } from "../../config/authMethods";

function Header() {
    const [accessToken, setAccessToken] = useState("");
    const [userName, setUserName] = useState("");

    useEffect(() => {
        setAccessToken(localStorage.getItem('accessToken'));
        setUserName(localStorage.getItem('userName'));
        if(localStorage.getItem('userName') === 'undefined' || localStorage.getItem('accessToken') === 'undefined') {
            localStorage.clear()
            setAccessToken("")
            setUserName("")
        }
    }, []);
    
    const handleOnClick = async (provider) => {
        if(!accessToken) {
            const res = await socialMediaAuth(provider);
            setUserName(res.additionalUserInfo?.username);
            setAccessToken(res.credential?.accessToken);
            localStorage.setItem('userName',res.additionalUserInfo?.username)
            localStorage.setItem('accessToken',res.credential?.accessToken)
        } else {
            setAccessToken("")
            localStorage.clear()
        }
        
    };

    return (
        <style.HeaderStyle>
            <style.HeaderLeftStyle>
                <style.LogoStyle>{HeaderStatic.HeaderLogoTitle}</style.LogoStyle>
                <DropdownNav props={HeaderStatic.HeaderNav}></DropdownNav>
            </style.HeaderLeftStyle>

            <style.HeaderRightStyle>
                <style.BasketStyle>
                    {
                        (accessToken)  ? `${userName}님` : `GUEST`
                    }
                </style.BasketStyle>
                <div style={{"width" : "1px", "height":"24px", "margin":"auto 0",backgroundColor : "lightgray"}} />
                <style.LoginStyle onClick={() => handleOnClick(githubProvider)} >
                    { (accessToken) ? <div style={{"color":"red", "fontWeight":"bold","border":"none","cursor":"pointer"}}>로그아웃</div> : <div style={{"fontWeight":"bold","outline":"none","cursor":"pointer"}} >로그인</div> }
                </style.LoginStyle>
                <style.SearchBarFormStyle>
                    <style.SearchBarStyle>
                    </style.SearchBarStyle>
                    <style.SearchButtonStyle>
                        <BiSearch size="25px" fill="#BDBDBD" />
                    </style.SearchButtonStyle>
                </style.SearchBarFormStyle>
                
            </style.HeaderRightStyle>
        </style.HeaderStyle>
    )
}

export { Header }