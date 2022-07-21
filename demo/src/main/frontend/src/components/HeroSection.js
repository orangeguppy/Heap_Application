import React from 'react'
import './HeroSection.css'
import PlaceholderVideo from '../resources/videos/PlaceholderVideo.mp4';
import { Button } from "./Button";
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";

function HeroSection() {
    return (
        <div className='hero-container'>
            <video src={PlaceholderVideo} autoPlay loop muted />
            <h1>WHERE STUFF HAPPENS</h1>
            <p>Join in the fun!</p>
            <div classname='hero-btns'>
                <Link to="/find-event">
                    <Button
                    buttonStyle='btn--colHero'
                    buttonSize='btn--hero'>GET STARTED<i class="fa-solid fa-fire"></i>
                    </Button>
                </Link>
            </div>
        </div>
    )
}
export default HeroSection