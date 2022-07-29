import './ContactUs.css';
import React, { useState, useEffect } from 'react';
import { Button } from '../Button';

function ContactUs() {
    const [name, setName] = useState('');
    const [email, setEmail] = useState('');
    const [message, setMessage] = useState('');

    const handleSubmit = (e) => {
        console.log("calling");
        e.preventDefault();
        fetch(`/create-event/${name}/${email}/${message}`)
            .then((response) => response.json())
            .then((data) => {
            })
        .catch((err) => {
            });
        }

    return(
        <div className="main-container">
            <div className="contact-form">
                <div className="contact-title">Contact Us
                    <div className="contact-components">
                        <form>
                            <label>Name:</label>
                                <div><br /></div>
                                <input type="text" name="name" onChange={event => setName(event.target.value)}
                                value={name}/>

                            <div><br /></div>

                            <label >Email:</label>
                                <div><br /></div>
                                <input type="text" name="email" onChange={event => setEmail(event.target.value)}
                                value={email}/>

                            <div><br /></div>

                            <label>Message: </label>
                                <div><br /></div>
                                <textarea
                                input type="text" name="message" onChange={event => setMessage(event.target.value)}
                                value={message}></textarea>

                            <div><br /></div>
                            <Button onClick>Submit</Button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    )
}
export default ContactUs;