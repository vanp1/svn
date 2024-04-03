<template>
    <div class="header-container">
        <TopCork></TopCork>
    </div>
    <div class="main-container" id="container">

        <div class="overlay"></div>
        <div class="search-overlay"></div>

        <div class="topbar-nav header navbar" role="banner">
            <MenuCork></MenuCork>

        </div>

        <div id="content" class="main-content">
            <router-view></router-view>
        </div>
        <BotCork></BotCork>
    </div>
</template>
<script>
import TopCork from "../components/TopCork.vue";
import BotCork from "../components/BotCork.vue";
import MenuCork from "../components/MenuCork.vue";
import "../../assets/js/libs/jquery-3.1.1.min.js";
import "../../bootstrap/js/bootstrap.min.js";
import "../../assets/js/app.js";

export default {
    name: "app",
    components: {
        TopCork, BotCork, MenuCork
    },

}
</script>
<style>
@import"../../bootstrap/css/bootstrap.min.css";
@import"../../assets/css/plugins.css";
@import"../../plugins/apex/apexcharts.css";
@import"../../assets/css/dashboard/dash_2.css";
</style>
