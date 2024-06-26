import React from "react";
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
      <button onClick={selectData}>test</button>
  );
}

export default App;