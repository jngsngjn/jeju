import React from "react";
import axios from "axios";
import './App.css';
import naverLogo from './naver_logo.png';

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
  const handleLogin = () => {
      window.location.href = 'http://localhost:8080/oauth2/authorization/naver';
  };

  return (
      <div className="App">
          <header className="App-header">
              <a href="http://localhost:8080/jeju/oauth2/authorization/naver">네이버 로그인</a>
              <button onClick={handleLogin} className="naver-button">
                  <img src={naverLogo} alt="Naver Logo" className="naver-logo"/>
              </button>
          </header>
      </div>
  );
}

export default App;