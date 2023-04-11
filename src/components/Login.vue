
<template>
    <div class="login-container">
        <div class="login-overlay"></div>
        <div class="login-card">
                <h2>Login</h2>
                <form>
                    <label for="username">Username:</label>
                    <input type="text" id="username" name="username">
                    <br>
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password">
                    <GoogleLogin :callback="callback" prompt auto-login/>
                </form>
        </div>
    </div>
</template>

<script lang="js">
import Card from './Card.vue';
import { decodeCredential } from "vue3-google-login";
import { mapMutations } from 'vuex';


export default {
    components: {
        Card
    },

    methods: {
        ...mapMutations(['setUserName', 'setProfilePicUrl']),
        callback(response) {
            // Handle the response from Google Login
            const userData = decodeCredential(response.credential);

            console.log("Handle the userData", userData);
            console.log("Handle the userData", userData.picture);
            this.profilePicUrl = userData.picture;
            this.setUserName(userData.name);
            this.setProfilePicUrl(userData.picture);

            // Redirect to Home.vue component
            this.$router.push('/user');
        }
    }
}
</script>

<style scoped>
.login-container {
    color: #2f2f2f;
    font-size: 6rem;
    position: fixed;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    display: flex;
    justify-content: center;
    align-items: center;
}

.login-overlay {
    position: fixed;
    width: 34rem;
    height: 43rem;
    border-radius: 1rem;
    background-color: rgb(239, 235, 235);
    backdrop-filter: blur(5px);
    z-index: 10;
}

.login-card {
    width: 5rem;
    position: relative;
    bottom: 9rem;
    z-index: 20;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
}
</style>
