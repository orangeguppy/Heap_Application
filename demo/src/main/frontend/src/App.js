import './App.css';
import React from 'react';
import Navbar from "./components/Navbar/Navbar";
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

import Home from './components/Pages/Home';
import FindEvent from './components/Pages/FindEvent';
import ParticipatingEvents from './components/Pages/ParticipatingEvents';
import ViewEvent from './components/Pages/ViewEvent';
import ManagedEvents from './components/Pages/ManagedEvents';
<<<<<<< HEAD
import ContactUs from './components/Pages/ContactUs';
=======
import CreateEvent from './components/Pages/CreateEvent';
>>>>>>> ece01d89c15c7ea3d611a32ae8c176310ce1d777

function App() {
  console.log("Hello WorldS");
  return (
    <>
        <Router>
            <Navbar />
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/find-event" element={<FindEvent />} />
                <Route path="/view-event/:id" element={<ViewEvent />} />
                <Route path="/participating-events" element={<ParticipatingEvents />} />
                <Route path="/managed-events" element={<ManagedEvents />} />
                <Route path="/contact-us" element={<ContactUs />} />
                <Route path="/create-event" element={<CreateEvent />} />
            </Routes>
        </Router>
    </>
  );
}
export default App;