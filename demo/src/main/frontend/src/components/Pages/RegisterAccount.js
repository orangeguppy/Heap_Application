import React, { useState, useEffect } from 'react';
import { useParams } from "react-router-dom";
import { Button } from '../Button.js'
import './RegisterAccount.css';

function RegisterAccount() {
    return(
         <div class="row justify-content-center">
            <div class="col col-md-5 text-center">

                 <form>
                     <h1> class="display-4">Sign Up</h1>

                     <div class="form-row py-1">
                        <label>User</label>
                        <input type="text" class="form-control" name="email"></input>
                     </div>

                      <div class="form-row py-1">
                         <label>Password</label>
                         <input type="password" class="form-control" name="password"></input>
                      </div>

                       <div class="form-row py-1">
                          <label>Re-enter password</label>
                          <input type="password" class="form-control" name="rpassword"></input>
                       </div>
                 </form>
            </div>
        </div>
    )
}
export default RegisterAccount;