import React from 'react'
import './HeroSection.css'
import PlaceholderVideo from '../resources/videos/PlaceholderVideo.mp4';
import { Button } from "./Button";

function HeroSection() {
    return (
        <div className='hero-container'>
            <video src={PlaceholderVideo} autoPlay loop muted />
            <h1>WHERE STUFF HAPPENS</h1>
            <p>Join in the fun!</p>
            <div classname='hero-btns'>
                    <Button
                    buttonStyle='btn--colHero'
                    buttonSize='btn--hero'>GET STARTED<i class="fa-solid fa-fire"></i>
                    </Button>
            </div>
        </div>
    )
}
export default HeroSection