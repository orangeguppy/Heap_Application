import React, { useState, useEffect } from 'react';
import { useParams } from "react-router-dom";
import './ViewEvent.css';
import { Button } from '../Button.js'
import Popup from '../Popup'

function ViewEvent() {
    const [events, setEvent] = useState({});
    const [buttonPopup, setButtonPopup] = useState(false);
    const [roles, setRoles] = useState([]);

    const [eventID, setEventID] = useState(0);
    const [userID, setUserID] = useState(0);
    const [role, setRole] = useState('');

    const { id } = useParams();

    useEffect(() => {
    // Render event details
        fetch(`/events/get-event-by-eid/${id}`)
            .then((response) => response.json())
            .then((data) => {
            setEvent(data);
            var array = data.roles.split('#');
            setEventID(id);
            setRoles(array);
            })
            .catch((err) => {
            console.log(err);
        });

    }, []);

    const handleSubmit = (e) => {
        console.log(role);
        e.preventDefault();
        fetch(`/event-registration/${id}/2/${role}`)
            .then((response) => response.json())
            .then((data) => {
            })
            .catch((err) => {
        });
    }

    return(
        <div className="ViewEvent">
            <div className="display">
                <div className="details">
                    <h1 className="title">{events.eventName}</h1>
                    <h2 className="label">Date and Time</h2>
                    <h3 className = "date">Start: {events.startDate}</h3>
                    <h3 className = "subtext">End: {events.endDate}</h3>
                    <h3 className = "subtext">{events.startTime} to {events.endTime}</h3>

                    <h2 className="label">Location</h2>
                    <h3 className = "subtext">{events.eventLocation}</h3>

                    <h2 className="label">Description</h2>
                    <p className="text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Viverra nibh cras pulvinar mattis nunc. Sed libero enim sed faucibus turpis in eu mi bibendum. Ut porttitor leo a diam sollicitudin tempor id eu. Vestibulum rhoncus est pellentesque elit ullamcorper dignissim cras tincidunt lobortis. Rhoncus dolor purus non enim praesent elementum facilisis leo vel. Id leo in vitae turpis massa. Nibh nisl condimentum id venenatis a condimentum vitae sapien. At consectetur lorem donec massa. Imperdiet proin fermentum leo vel orci porta non pulvinar neque. Ultricies mi quis hendrerit dolor magna eget. Eget velit aliquet sagittis id consectetur purus ut.
                     Massa ultricies mi quis hendrerit dolor magna eget est. Arcu risus quis varius quam quisque id diam
                    </p>

                    <Button className="join-btn" onClick={() => setButtonPopup(true)} buttonStyle='btn--join'>Join</Button>
                    <Popup trigger={buttonPopup} setTrigger={setButtonPopup}>
                        <h1>JOIN {events.eventName}</h1>
                        <h2>Enter your role(pick one): {roles.map(role => <li className="role-item">{role}</li>)}</h2>
                        <div><br /></div>

                        <form className="register" onSubmit= {(e) => { handleSubmit(e) }}>
                            <label>
                                Role:
                            <input type="text" name="_role" onChange={event => setRole(event.target.value)}
                                                                      value={role}/>
                          </label>
                          <div><br /></div>
                          <Button
                            onClick= {(e) => { handleSubmit(e) }}
                            onClick={() => setButtonPopup(false)}
                            >
                          Submit Registration
                          </Button>
                        </form>

                    </Popup>
                </div>
                <img className="image" src={events.imageURL}/>
            </div>
        </div>
    )
}
export default ViewEvent;