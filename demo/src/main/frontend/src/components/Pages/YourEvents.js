import React,  { Component } from 'react';
import './YourEvents.css';
import { Button } from "../../components/Button";
import { BrowserRouter as Router, Switch, Route, Routes, Link,useNavigate } from "react-router-dom";


import CreateEvent from './CreateEvent';
import JoinedEvent from './JoinedEvent';
import CreatedEvent from './CreatedEvent';



function YourEvents() {
    <Router>
        <Routes>
            <Route path="/create-event" element={<CreateEvent />} />
            <Route path="/created-event" element={<CreatedEvent />} />
            <Route path="/joined-event" element={<JoinedEvent />} />
        </Routes>
    </Router>

    return (
//        <>
//            <h1>Event</h1>
//        </>

        <div className="wrapper">
            <div classname='createEvent-btns'>
                <Link to="/create-event">
                    <Button
                    buttonStyle='btn--createEvent'
                    buttonSize='btn--createEvent'>Create Event!<i class=""></i>
                    </Button>
                </Link>
            </div>
            <div classname='hero-btns'>
                <Link to="/joined-event">
                    <Button
                    buttonStyle='btn--colHero'
                    buttonSize='btn--hero'>Joined Events<i class=""></i>
                    </Button>
                </Link>
                <Link to="/created-event">
                    <Button
                    buttonStyle='btn--colHero'
                    buttonSize='btn--hero'>Created Events<i class=""></i>
                    </Button>
                </Link>

            </div>
        </div>
    )
}
export default YourEvents;