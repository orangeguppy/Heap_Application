import React, { useState, useEffect } from 'react';
import { useParams } from "react-router-dom";
import { Button } from '../Button.js'
import './RegisterAccount.css';

function RegisterAccount() {

    const handleSubmit = (e) => {
        //console.log(role);
        e.preventDefault();
        fetch(`process-account`)
            .then((response) => response.json())
            .then((data) => {
            })
            .catch((err) => {
        });
    }



    return(
         <div class="container text-center">
                 <form method="post" action="/process-account" Object="${user}">
                     <h1 class="display-4">Sign Up</h1>

                     <div class="form-row py-1">
                        <label>User</label>
                        <input type="text" class="form-control" name="user" field="*{user}" required minlength = "6" maxlength = "16"></input>
                     </div>

                     <div class="form-row py-1">
                        <label>Email</label>
                        <input type="email" class="form-control" name="email" field="*{email}" required></input>
                     </div>

                      <div class="form-row py-1">
                         <label>Password</label>
                         <input type="password" class="form-control" name="password" field="*{password}" required></input>
                      </div>

                       <div class="form-row py-1">
                          <label>Re-enter password</label>
                          <input type="password" class="form-control" name="rpassword" field="*{rpassword}" required></input>
                       </div>

                      <div class="form-row py-1">
                         <label>First Name</label>
                         <input type="text" class="form-control" name="firstname" field="*{firstname}" required></input>
                      </div>

                     <div class="form-row py-1">
                        <label>Last Name</label>
                        <input type="text" class="form-control" name="lastname" field="*{lastname}" required></input>
                     </div>

                     <div class="form-row py-1">
                        <button type="submit" class="btn btn-info btn-block">
                            Create Your Account
                        </button>
                     </div>
                 </form>
                 <p class="py-2"> Already have an account? <a href="/login-account"> Sign-In</a> </p>
        </div>
    )
}
export default RegisterAccount;