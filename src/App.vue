<script lang="ts">
import UserSideBar from "@/components/UserSideBar.vue";
import {defineComponent} from "vue";

export default defineComponent({
    components: {UserSideBar}
})


</script>


<template>
    <div id="app">
<!--        <router-view></router-view>-->
       <UserSideBar></UserSideBar>
    </div>
</template>