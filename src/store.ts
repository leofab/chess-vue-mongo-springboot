import Vuex from 'vuex';

export default new Vuex.Store({
    state(){
        return {
            userName: '',
            profilePicUrl:''
        };
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
