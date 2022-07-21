import React from "react";
import './EventCard.css';
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";

const EventCard = ({title, startDate, image, id, description}) => {
    return (
        <Link to={`/view-event/${id}`} style={{ textDecoration: 'none' }}>
            <div className="card">
                <img src={image} alt=""/>
                <h1>{title}</h1>
                <h2 className="date">{startDate}</h2>
                <h3>{description}</h3>
            </div>
        </Link>
    );
}
export default EventCard