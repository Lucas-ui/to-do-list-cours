<template>
  <section class="h-full">
    <div class="flex flex-col items-center pt-[10vh]">
      <img
        class="w-[150px] h-[150px]"
        src="../assets/images/icon-todo.png"
        alt="Logo"
      />
      <h2 class="font-medium text-2xl mt-[-15px] mb-3">Se connecter</h2>
      <form class="flex flex-col items-center" action="">
        <label class="w-full mt-2 mb-1" for="email">Email</label>
        <input
          class="rounded-md border border-gray-200 pl-2 mb-1 p-1 focus:outline-orange-300"
          type="mail"
          name="email"
        />
        <label class="w-full mt-2 mb-1" for="password">Mot de passe</label>
        <input
          class="rounded-md border border-gray-200 pl-2 p-1 focus:outline-orange-300"
          type="password"
          name="password"
        />
        <router-link class="mt-5" to="/home">
          <a
            class="text-black bg-orange-300 p-2 rounded-md cursor-pointer"
            to="/home"
          >
            Connexion
          </a>
        </router-link>
      </form>
    </div>
  </section>
</template>

<script setup>
import { useRouter } from "vue-router";
const router = useRouter();
</script>
