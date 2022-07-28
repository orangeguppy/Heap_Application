import React, { Component, useState, useEffect } from 'react';
import './PartEventsSearch.css';
import EventCard from '../EventCard/EventCard';

function PartEventsSearch({placeholder, input}) {
    const [search, setSearch] = useState("");
    const [events, setEvents] = useState([]);
    const [_query, _setQuery] = useState('Placeholder');

    useEffect(() => {
        fetch(`/events/registered-by-user/2/${_query}`)
          .then((response) => response.json())
          .then((data) => {
            setEvents(data);
          })
          .catch((err) => {
            console.log(err);
          });
    }, [_query]);

    const updateSearch = e => {
        setSearch(e.target.value);
        console.log(search);
    }

    const getSearch = e => {
        e.preventDefault();
        _setQuery(search);
    }

    return(
        <div className="search">
            <form onSubmit={getSearch} className="searchInputs">
                <input type="text" placeholder={placeholder} value={search} onChange={updateSearch}/>
            </form>

            <div className="dataResult">
                {events.map(data => (
                    <EventCard
                        key={data.eid}
                        title={data.eventName}
                        startDate={data.startDate}
                        image={data.imageURL}
                        id={data.eid}
                        description={data.description}
                    />
                ))}
            </div>
        </div>
    )
}
export default PartEventsSearch;