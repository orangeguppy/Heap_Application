import './ParticipatingEvents.css';
import EventCard from '../EventCard/EventCard';
import React, { useState, useEffect } from 'react';
import PartEventsSearch from '../ParticipatingEventsSearch/PartEventsSearch';

function ParticipatingEvents() {
    return(
        <div className="wrapper">
            <div className="FindPartEvent">
                <PartEventsSearch placeholder="Find something..." />
            </div>
        </div>
    )
}
export default ParticipatingEvents;