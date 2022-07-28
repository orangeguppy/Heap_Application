import React, { Component, useState, useEffect } from 'react';
import ManagedEventsSearch from '../ManagedEventsSearch/ManagedEvents';
import EventCard from '../EventCard/EventCard';

function ManagedEvents() {
    return(
        <div>
            <ManagedEventsSearch placeholder="Search for events you're managing..."/>
        </div>
    )
}
export default ManagedEvents;