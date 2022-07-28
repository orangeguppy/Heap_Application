import React, { useState, useEffect } from 'react';
import '../../CreateEvent.css';
import {Link} from 'react-router-dom';

function CreateEvent() {
const [eventName, setEventName] = useState('');
const [eventDescription, setEventDescription] = useState('');
const [eventDescription, setEventDescription] = useState('Competition');
const [eventStartDate, setEventStartDate] = useState(); //tbc
const [eventEndDate, setEventEndDate] = useState(); //tbc
const [eventLocation, setEventLocation] = useState('');
const [maxCapacity, setMaxCapacity] = useState(0);
const [eventRoles, setEventRoles] = useState('');
const [signupsStartDate, setSignupsStartDate] = useState(); //tbc
const [signupsEndDate, setSignupsEndDate] = useState(); //tbc


    return(
        <div>
            <h1> Create New Event </h1>
            <h2> Event Details </h2>
            <form>
            <label> Event Name </label>
            <input type="text" placeholder="Enter event name"
            required
            value={eventName}
            onChange = {(e) => setEventName(e.target.value)}
            />
            <label> Event Description </label>
            <textarea
            required
            value={eventDescription}
            onChange = {(e) => setEventDescription(e.target.value)}
            ></textarea>
            <label> Event Type </label>
            <select
            value = {eventType}
            onChange = {(e) => setEventType(e.target.value)}
            >
                <option value="HTML">Select an Event Type</option>
                <option value="Competition">Competition</option>
                <option value="Seminar">Seminar</option>
                <option value="Others">Others</option>
            </select>
            <label> Event Start Date </label>
            <input type="datetime-local"
            value = {eventStartDate}
            onChange = {(e) => setEventStartDate(e.target.value)}
            />
            <label> Event End Date </label>
            <input type="datetime-local"
            value = {eventEndDate}
            onChange = {(e) => setEventEndDate(e.target.value)}
            />
            <label> Location </label>
            <input type="text" placeholder="Enter event location"
            required
            value={eventLocation}
            onChange = {(e) => setEventLocation(e.target.value)}
            />
            <label> Capacity </label>
            <input type="number" placeholder="Enter a number"
            value={maxCapacity}
            onChange = {(e) => setMaxCapacity(e.target.value)}
            />
            <h2> Participants </h2>
            <label> Roles Available</label>
            <select
            value = {eventRoles}
            onChange = {(e) => setEventRoles(e.target.value)} //how to choose multiple?
            >
                 <option value="HTML">Select a Role</option>
                 <option value="Host">Host</option>
                 <option value="Judge">Judge</option>
                 <option value="Participant">Participant</option>
                 <option value="Custom">Custom</option>
            </select>
            <h2> Signups </h2>
            <label> Signups Start Date </label>
            <input type="datetime-local"
            value = {signupsStartDate}
            onChange = {(e) => setSignupsStartDate(e.target.value)}
            />
            <label> Signups End Date </label>
            <input type="datetime-local"
            value = {signupsEndDate}
            onChange = {(e) => setSignupsEndDate(e.target.value)}
            />
            <h2> Alerts </h2>

            </form>
            <button>Click</button>
        </div>
    )
}
export default CreateEvent;