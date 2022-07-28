import './App.css';
import React from 'react';
import Navbar from "./components/Navbar/Navbar";
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

import Home from './components/Pages/Home';
import FindEvent from './components/Pages/FindEvent';
import YourEvents from './components/Pages/YourEvents';
import ViewEvent from './components/Pages/ViewEvent';
import ContactUs from './components/Pages/ContactUs';

function App() {
  console.log("Hello WorldS");
  return (
    <>
        <Router>
            <Navbar />
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/find-event" element={<FindEvent />} />

                <Route path="/your-events/*" element = {<YourEvents />} />
                <Route path="/view-event/:id" element={<ViewEvent />} />
                <Route path="/contact-us" element={<ContactUs />} />
            </Routes>
        </Router>
    </>
  );
}
export default App;