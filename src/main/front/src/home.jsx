import React from 'react';
import {useNavigate} from "react-router-dom";
import jeju_main_1 from "./image/jeju_main_1.png";
import './Home.css';

const Home = (props) => {
    const navigate = useNavigate();
    return (
        <div>
            <img src={jeju_main_1} className="jeju-main-1" />
            <h3>카테고리</h3>
        </div>
    );
};

export default Home;