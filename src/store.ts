import {createStore} from 'vuex';

export default createStore({
    state:{
          userName: '',
          profilePicUrl:''
    },
    mutations: {
        setUserName(state, userName) {

            state.userName = userName;
        },
        setProfilePicUrl(state, profilePicUrl) {
            state.profilePicUrl = profilePicUrl;
        },
    }
})
