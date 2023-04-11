import {createStore} from 'vuex';

export default createStore({
    state:{
          userName: '',
          profilePicUrl:''
    },
    getters:{
        getUserName(){

        }
    },
    actions:{
        // methods
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
