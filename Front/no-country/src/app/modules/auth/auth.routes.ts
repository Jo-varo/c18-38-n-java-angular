import { Routes } from "@angular/router";
import { LoginComponent } from "./components/login/login.component";
import { SignUpComponent } from "./components/sign-up/sign-up.component";

export const AuthRoutes: Routes = [
    {
        path: "login",
        component: LoginComponent
    },
    {
        path: "sign-up",
        component: SignUpComponent
    }
]