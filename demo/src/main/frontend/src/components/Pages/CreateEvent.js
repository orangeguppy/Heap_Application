import React, { useState } from 'react';
import './CreateEvent.css';
import {Link} from 'react-router-dom';
import { Button } from '../Button';
import Popup from '../Popup'

function CreateEvent() {
const [eventName, setEventName] = useState('');
const [eventDescription, setEventDescription] = useState('');
const [eventType, setEventType] = useState('');
const [startDate, setEventStartDate] = useState(); //tbc
const [endDate, setEventEndDate] = useState(); //tbc

const [eventLocation, setEventLocation] = useState('');

const [maxCapacity, setMaxCapacity] = useState(0);

const [eventRoles, setEventRoles] = useState('');
const [regStartDate, setSignupsStartDate] = useState();
const [regEndDate, setSignupsEndDate] = useState();
const [minAge, setMinAge] = useState(0);

const [startTime, setStartTime] = useState();
const [endTime, setEndTime] = useState();

const [buttonPopup, setButtonPopup] = useState(false);

    const handleSubmit = (e) => {
        console.log("calling");
        e.preventDefault();
        fetch(`/create-event/${eventName}/${maxCapacity}/${eventLocation}/${minAge}/${eventRoles}`)
            .then((response) => response.json())
            .then((data) => {
            })
            .catch((err) => {
        });
    }

    return(
        <div className="creating-events">
            <div className="form-wrapper">

            <div className="tag-item">
                <span className="text"> Create New Event </span>
            </div>

            <form onSubmit= {(e) => { handleSubmit(e) }}>
            <label>Event Name</label>
            <div><br /></div>
            <input type="text" placeholder="Enter event name"
            required
            value={eventName}
            onChange = {(e) => setEventName(e.target.value)}
            />

            <div><br /></div>

            <label> Event Description </label>
            <div><br /></div>
            <textarea
            required
            value={eventDescription}
            onChange = {(e) => setEventDescription(e.target.value)}
            ></textarea>

            <div><br /></div>

            <label> Event Type </label>

            <div><br /></div>
            <input type="text"
            value = {eventType}
            onChange = {(e) => setEventType(e.target.value)}
            />

            <div><br /></div>

            <label> Event Start Date </label>
            <div><br /></div>
            <input type="date-local"
            value = {startDate}
            onChange = {(e) => setEventStartDate(e.target.value)}
            />

            <div><br /></div>
            <label> Event End Date </label>
            <div><br /></div>
            <input type="date-local"
            value = {endDate}
            onChange = {(e) => setEventEndDate(e.target.value)}
            />

            <div><br /></div>

            <label> Location </label>
            <div><br /></div>
            <input type="text" placeholder="Enter event location"
            required
            value={eventLocation}
            onChange = {(e) => setEventLocation(e.target.value)}
            />

            <div><br /></div>

            <label> Capacity </label>
            <div><br /></div>
            <input type="number" placeholder="Enter a number"
            value={maxCapacity}
            onChange = {(e) => setMaxCapacity(e.target.value)}
            />

            <div><br /></div>

            <div className="tag-item">
                <span className="text"> Participants </span>
            </div>

            <div><br /></div>

            <label> Roles Available</label>
            <div><br /></div>
            <input type="text"
            value = {eventRoles}
            onChange = {(e) => setEventRoles(e.target.value)}
            />

            <div><br /></div>
            <div><br /></div>

            <div className="tag-item">
                <span className="text"> Sign Ups </span>
            </div>

            <div><br /></div>

            <label> Signups Start Date </label>
            <div><br /></div>
            <input type="date-local"
            value = {regStartDate}
            onChange = {(e) => setSignupsStartDate(e.target.value)}
            />

            <div><br /></div>

            <label> Signups End Date </label>
            <div><br /></div>
            <input type="date-local"
            value = {regEndDate}
            onChange = {(e) => setSignupsEndDate(e.target.value)}
            />

            <div><br /></div>

            <label>Start Time</label>
            <div><br /></div>
            <input type="time"
            value = {startTime}
            onChange = {(e) => setStartTime(e.target.value)}
            />

            <div><br /></div>

            <label>End Time</label>
            <div><br /></div>
            <input type="time"
            value = {endTime}
            onChange = {(e) => setEndTime(e.target.value)}
            />

            <div><br /></div>
            <div><br /></div>
            <div><br /></div>

            </form>
            <Button onClick= {(e) => { handleSubmit(e) }} onClick={() => setButtonPopup(true)}>Create Event</Button>
            </div>

            <Popup trigger={buttonPopup} setTrigger={setButtonPopup} className="pops">
                <h1>Event created!</h1>
                <img src="data:image/png;base64,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"/>
            </Popup>
        </div>
    )
}
export default CreateEvent;