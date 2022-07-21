import React, { useState, useEffect } from 'react';
import { useParams } from "react-router-dom";
import './ViewEvent.css';

function ViewEvent() {
    const [events, setEvent] = useState({});
    const { id } = useParams();
    // const [isSameDay, setIsSameDay] = useState({events.isSameDay});

    useEffect(() => {
    // Render event details
        fetch(`/events/get-event-by-eid/${id}`)
            .then((response) => response.json())
            .then((data) => {
            setEvent(data);
            })
            .catch((err) => {
            console.log(err);
        });
    }, []);

    return(
        <div className="ViewEvent">
            <div className="display">
                <div className="details">
                    <h1 className="title">{events.eventName}</h1>
                    <h2 className="label">Date and Time</h2>
                    <h3 className = "date">Start: {events.startDate}</h3>
                    <h3 className = "date">End: {events.endDate}</h3>

                    <h2 className="label">Location</h2>
                    <h3 className = "date">{events.eventLocation}</h3>

                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Viverra nibh cras pulvinar mattis nunc. Sed libero enim sed faucibus turpis in eu mi bibendum. Ut porttitor leo a diam sollicitudin tempor id eu. Vestibulum rhoncus est pellentesque elit ullamcorper dignissim cras tincidunt lobortis. Rhoncus dolor purus non enim praesent elementum facilisis leo vel. Id leo in vitae turpis massa. Nibh nisl condimentum id venenatis a condimentum vitae sapien. At consectetur lorem donec massa. Imperdiet proin fermentum leo vel orci porta non pulvinar neque. Ultricies mi quis hendrerit dolor magna eget. Eget velit aliquet sagittis id consectetur purus ut.
                     Massa ultricies mi quis hendrerit dolor magna eget est. Arcu risus quis varius quam quisque id diam
                       Adipiscing elit duis tristique sollicitudin nibh sit amet. Vestibulum rhoncus est pellentesque elit. Ut faucibus pulvinar elementum integer enim neque. Massa tempor nec feugiat nisl. Bibendum ut tristique et egestas quis ipsum. Facilisis sed odio morbi quis commodo odio aenean. Cursus mattis molestie a iaculis at. Risus ultricies tristique nulla aliquet enim tortor at auctor urna. Purus sit amet luctus venenatis lectus magna fringilla urna. In est ante in nibh mauris cursus mattis molestie. Id diam vel quam elementum pulvinar. At urna condimentum mattis pellentesqu
                       Aliquam sem et tortor consequat id. Nec nam aliquam sem et tortor. Nec nam aliquam sem et tortor. Condimentum vitae sapien pellentesque habitant morbi tristique senectus et netus. Magnis dis parturient montes nascetur ridiculus mus. Laoreet suspendisse interdum consectetur libero id faucibus nisl tincidunt. A iaculis at erat pellentesque adipiscing. Condimentum lacinia quis vel eros donec ac odio. At varius vel pharetra vel turpis nunc. Enim neque volutpat ac tincidunt vitae semper quis lectus. Lacinia quis vel eros donec ac odio tempor orci. Duis convallis convallis tellus id interdum velit laoreet id. Pulvinar mattis nunc sed blandit libero volutpat sed cras ornare. Tellus molestie nunc non blandit massa. Sed risus ultricies tristique nulla aliquet enim tortor at auctor.
                    </p>
                </div>
                <img className="image" src={events.imageURL}/>
            </div>
        </div>
    )
}
export default ViewEvent;