import EventsList from '../EventsTable/EventsList';
import SearchBar from '../SearchBar/SearchBar';
import './FindEvent.css';
import EventCard from '../EventCard/EventCard';
import React, { useState, useEffect } from 'react';

function FindEvent() {
    return(
        <div className="wrapper">
            <div className="FindEvent">
                <SearchBar placeholder="Find something..." />
            </div>
        </div>
    )
}
export default FindEvent;