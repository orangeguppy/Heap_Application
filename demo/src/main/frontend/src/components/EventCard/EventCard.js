import React from "react";
import './EventCard.css'
const EventCard = ({title, startDate, image}) => {
    return (
        <div className="card">
            <img src={image} alt=""/>
            <h1>{title}</h1>
            <p>{startDate}</p>
        </div>
    );
}
export default EventCard