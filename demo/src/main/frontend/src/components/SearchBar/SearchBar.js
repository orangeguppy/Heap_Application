import React, { Component, useState, useEffect } from 'react';
import './SearchBar.css';
import { Button } from "../Button";
import EventCard from '../EventCard/EventCard';

function SearchBar({placeholder, input}) {
    const [search, setSearch] = useState("");
    const [users, setUsers] = useState([]);
    const [query, setQuery] = useState('');

    useEffect(() => {
        fetch(`/events/${query}`)
          .then((res) => res.json())
          .then((data) => {
            setUsers(data);
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
                <Button className="filter"
                    buttonSize="btn--square"
                    buttonStyle="btn--filter">
                        <i class="fa-solid fa-filter"></i>
                </Button>
            </form>

            <div className="dataResult">
                {users.map(data => (
                    <EventCard
                        key={data.EID}
                        title={data.eventName}
                        startDate={data.startDateTime}
                        image={data.imageURL}
                    />
                ))}
            </div>
        </div>
    )
}
export default SearchBar;