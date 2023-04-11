<template>
    <div>
        <Topbar />
        <div class="container">
            <UserSideBarHome />
            <Body />
        </div>
        <FloaterFooter />
    </div>
</template>

<script>
import Body from "@/components/Body.vue";
import Topbar from "@/components/Topbar.vue";
import FloaterFooter from "@/components/FloaterFooter.vue";
import Card from "@/components/Card.vue";
import UserSideBarHome from "@/components/UserSideBarHome.vue";

export default {
    components: {
        Body,
        UserSideBarHome,
        Topbar,
        FloaterFooter,
        Card,
    },
};
</script>