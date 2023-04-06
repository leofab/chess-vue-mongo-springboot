<template>
    <div class="floating-footer">
        <p>© 2023 Chess VMSP. All rights reserved.</p>
        <div>
            <ul class="footer_side_login">
                <li><a href="#">
                    <svg xmlns="http://www.w3.org/2000/svg"
                         width="24" height="24" viewBox="0 0 24 24"
                         style="fill: rgb(0,255,72);transform: ;msFilter:;">
                        <path d="M20 3H4c-1.103 0-2 .897-2 2v14c0 1.103.897 2 2 2h5v-2H4V7h16v12h-5v2h5c1.103 0 2-.897 2-2V5c0-1.103-.897-2-2-2z"></path><path d="M13 21v-5h3l-4-5-4 5h3v5z">
                    </path>
                    </svg></a></li>
                <li><a href="#">
                    <svg xmlns="http://www.w3.org/2000/svg"
                         width="24" height="24" viewBox="0 0 24 24"
                         style="fill: rgb(255,85,0);transform: ;msFilter:;">
                        <path d="m7 17.013 4.413-.015 9.632-9.54c.378-.378.586-.88.586-1.414s-.208-1.036-.586-1.414l-1.586-1.586c-.756-.756-2.075-.752-2.825-.003L7 12.583v4.43zM18.045 4.458l1.589 1.583-1.597 1.582-1.586-1.585 1.594-1.58zM9 13.417l6.03-5.973 1.586 1.586-6.029 5.971L9 15.006v-1.589z"></path><path d="M5 21h14c1.103 0 2-.897 2-2v-8.668l-2 2V19H8.158c-.026 0-.053.01-.079.01-.033 0-.066-.009-.1-.01H5V5h6.847l2-2H5c-1.103 0-2 .897-2 2v14c0 1.103.897 2 2 2z">
                    </path>
                    </svg></a></li>
                <li><a href="#">
                    <svg xmlns="http://www.w3.org/2000/svg"
                         width="24" height="24" viewBox="0 0 24 24"
                         style="fill: rgb(0,255,72);transform: ;msFilter:;">
                        <path d="M20 3H4c-1.103 0-2 .897-2 2v14c0 1.103.897 2 2 2h5v-2H4V7h16v12h-5v2h5c1.103 0 2-.897 2-2V5c0-1.103-.897-2-2-2z"></path><path d="M13 21v-5h3l-4-5-4 5h3v5z">
                    </path>
                    </svg></a></li>
                <li><a href="#">
                    <svg xmlns="http://www.w3.org/2000/svg"
                         width="24" height="24" viewBox="0 0 24 24"
                         style="fill: rgb(255,85,0);transform: ;msFilter:;">
                        <path d="m7 17.013 4.413-.015 9.632-9.54c.378-.378.586-.88.586-1.414s-.208-1.036-.586-1.414l-1.586-1.586c-.756-.756-2.075-.752-2.825-.003L7 12.583v4.43zM18.045 4.458l1.589 1.583-1.597 1.582-1.586-1.585 1.594-1.58zM9 13.417l6.03-5.973 1.586 1.586-6.029 5.971L9 15.006v-1.589z"></path><path d="M5 21h14c1.103 0 2-.897 2-2v-8.668l-2 2V19H8.158c-.026 0-.053.01-.079.01-.033 0-.066-.009-.1-.01H5V5h6.847l2-2H5c-1.103 0-2 .897-2 2v14c0 1.103.897 2 2 2z">
                    </path>
                    </svg></a></li>
            </ul>
        </div>
    </div>


</template>

<style scoped>
.footer_side_login{
    width: 100%;
    bottom: 0;
    left: 0;
    margin-left: 48rem;
    /*position: fixed;*/
    display: flex;

}
.floating-footer {
    position: fixed;
    bottom: 0;
    right: 0;
    width: 100%;
    background-color: #444444;
    color: #fff;
    padding: 0.675rem 1rem 0.675rem 1rem;
    box-shadow: 0 -4px 4px rgba(234, 233, 233, 0.1);
    text-align: end;
    align-items: end;
    display: flex;
    direction: rtl;
}
ul{
    padding-right: 1.225rem;
}

li{
    margin-left: 1rem;
    margin-bottom: 0.195rem;
}
p{
    font-size: 1rem;
    margin-right: 2rem;
}
</style>
<script setup lang="ts">
</script>