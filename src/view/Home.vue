<template>
    <div>
        <Topbar />
        <div class="container">
            <SideBar />
            <Body />
        </div>
        <FloaterFooter />
    </div>
</template>

<script>
import Body from "@/components/Body.vue";
import SideBar from "@/components/SideBar.vue";
import Topbar from "@/components/Topbar.vue";
import FloaterFooter from "@/components/FloaterFooter.vue";
import Card from "@/components/Card.vue";

export default {
    components: {
        Body,
        SideBar,
        Topbar,
        FloaterFooter,
        Card,
    },
};
</script>