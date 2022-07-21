import React, { Component, useState, useEffect } from 'react';
import './SearchBar.css';
import { Button } from "../Button";
import EventCard from '../EventCard/EventCard';

function SearchBar({placeholder, input}) {
    const [search, setSearch] = useState("");
    const [events, setEvents] = useState([]);
    const [query, setQuery] = useState('');

    useEffect(() => {
        fetch(`/events/${query}`)
          .then((response) => response.json())
          .then((data) => {
            setEvents(data);
          })
          .catch((err) => {
            console.log(err);
          });
    }, [query]);

    const updateSearch = e => {
        setSearch(e.target.value);
        console.log(search);
    }

    const getSearch = e => {
        e.preventDefault();
        setQuery(search);
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
export default SearchBar;