import React, { useState } from 'react';
import './CreateEvent.css';
import {Link} from 'react-router-dom';
import { Button } from '../Button';

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
            <Button onClick= {(e) => { handleSubmit(e) }}>Create Event</Button>
            </div>
        </div>
    )
}
export default CreateEvent;