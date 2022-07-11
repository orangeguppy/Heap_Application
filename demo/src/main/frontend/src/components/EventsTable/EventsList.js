import React, { useState, useEffect } from 'react';

function EventsList() {
   const [users, setUsers] = useState([]);

    useEffect(() => {
        fetch('/users/')
          .then((res) => res.json())
          .then((data) => {
            setUsers(data);
          })
          .catch((err) => {
            console.log(err);
          });
      }, []);

    return(
        <div>
            {users.map(user =>
                <div key={user.UID}>
                    {user.UID} {user.firstName}
                </div>
            )}
        </div>
    )
}
export default EventsList