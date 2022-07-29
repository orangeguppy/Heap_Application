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
        <div className="contact-wrapper">
            <div className="contact-img">
                <img src="https://images.pexels.com/photos/4831/hands-coffee-smartphone-technology.jpg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2"
                />
            </div>

            <div className="contact-form">
                <h1 className="contact-title">Contact Us</h1>
                <form>
                    <label>
                        Name:
                        <input type="text" name="name" onChange={event => setName(event.target.value)}
                        value={name}/>
                    </label>
                    <div><br /></div>

                    <label>
                        Email:
                        <input type="text" name="email" onChange={event => setEmail(event.target.value)}
                        value={email}/>
                    </label>
                    <div><br /></div>

                    <label>
                        Message:
                        <input type="text" name="message" onChange={event => setMessage(event.target.value)}
                        value={message}/>
                    </label>
                    <div><br /></div>
                </form>
                <Button onClick= {(e) => { handleSubmit(e) }}> Submit</Button>
            </div>
        </div>
    )
}
export default ContactUs;