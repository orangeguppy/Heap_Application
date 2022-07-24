import React from 'react';
import './Popup.css';

function Popup(props) {
    return(props.trigger) ? (
        <div className="popup">
            <div className="popup-inner">
                <button className="close-btn" onClick={() => props.setTrigger(false)}>
                    <h1><i class="fa-solid fa-rectangle-xmark"></i></h1>
                </button>
                { props.children }
            </div>
        </div>
    ) : "";
}
export default Popup