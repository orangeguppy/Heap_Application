import React from 'react';
import '../../CreateEvent.css';
import {Link} from 'react-router-dom';

function CreateEvent() {
    return(
        <div>
            <h1> Create New Event </h1>
            <h2> Event Details </h2>
            <h3> Event Name </h3>
            <input type="text" placeholder="Enter event name" />
            <h3> Event Type </h3>
            <select>
                  <option value="HTML">Select an Event Type</option>
                  <option value="Competition">Competition</option>
                  <option value="Seminar">Seminar</option>
                  <option value="Others">Others</option>
            </select>
            <h3> Event Start Date </h3>
            <input type="datetime-local" />
            <h3> Event End Date </h3>
            <input type="datetime-local" />
            <h3> Location </h3>
            // tbc
            <h3> Capacity </h3>
            <input type="number" placeholder="Enter a number" />
            <h2> Participants </h2>
            <h3> Roles </h3>
            <select>
                  <option value="HTML">Select a Role</option>
                  <option value="Host">Host</option>
                  <option value="Judge">Judge</option>
                  <option value="Participant">Participant</option>
                  <option value="Custom">Custom</option>
            </select>
            <h2> Signups </h2>
            <h3> Signups Start Date </h3>
            <input type="datetime-local" />
            <h3> Signups End Date </h3>
            <input type="datetime-local" />
            <h2> Alerts </h2>
                const accountSid = '[AccountSid]';
                const authToken = '[authToken]';
                const client = require('twilio')(accountSid, authToken);

                delta_days = 0

                if (delta_days == 1){
                    client.messages
                        .create({
                            body: 'Your appointment is coming up on July 29 at 3PM ok?',
                            from: 'whatsapp:+14155238886',
                            to: 'whatsapp:+6587269341'
                        })
                        .then(message => console.log(message.sid))
                        .done();
                }


            <button>Click</button>
        </div>
    )
}
export default CreateEvent;