<script lang="js">

import {defineComponent} from "vue";
import UserSideBarHome from "@/components/UserSideBarHome.vue";
import Body from "@/components/Body.vue";
import Board from "@/components/Board.vue"

export default defineComponent({
    components: {Body, UserSideBarHome, Board}
})
</script>
<template>
  <div>
      <div class="container">
          <UserSideBarHome />
          <Board />
      </div>
  </div>
</template>