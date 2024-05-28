import React from "react";
import {BrowserRouter, Routes, Route, Link} from "react-router-dom";
import './App.css';
import Home from './home';
import MyPage from './mypage';
import Login from './login';

import axios from "axios";

function selectData() {
  axios.get('/hello')  // 프록시 설정에 의해 http://localhost:8080이 자동으로 붙습니다.
      .then(function (res) {
        alert(res.data);  // 응답 데이터 출력
      })
      .catch(function (error) {
        alert("Error: " + error.message);  // 에러 메시지 출력
      });
}

function App() {
    return (
        <BrowserRouter>
            <nav>
                <div className="nav-left">
                    <Link to='/home' className="header header-home">Home</Link>
                    <input type="text" placeholder="검색어를 입력하세요." className="search-bar" />
                </div>
                <div className="nav-right">
                    <Link to='/login' className="header header-login">Login</Link>
                    <Link to='/mypage' className="header header-mypage">MyPage</Link>
                </div>
            </nav>
            <hr/>
            <Routes>
                <Route path='/' element={<Home />} />
                <Route path='/home' element={<Home />} />
                <Route path='/mypage' element={<MyPage />} />
                <Route path='/login' element={<Login />} />
            </Routes>
        </BrowserRouter>
    );
}

export default App;