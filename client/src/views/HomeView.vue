<template>
  <section class="h-ful p-5 bg-gray-50">
    <div
      class="flex justify-between items-center relative bg-orange-200 border border-orange-300 text-black p-5 rounded-md"
    >
      <h1>To-Do list Application</h1>
      <button
        class="cursor-pointer bg-green-200 border border-green-300 text-black p-1 rounded-md"
        @click="displayModalCreateTast"
      >
        Créer une tâche
      </button>
    </div>
    <!-- Liste des tâches créées -->
    <div
      class="p-5 relative min-h-[600px] bg-gray-100 mt-4 border border-gray-200 rounded-md"
    ></div>

    <div
      v-if="isModalCreateTaskOpen"
      class="fixed inset-0 bg-orange-100 flex justify-center items-center z-50 h-screen"
    >
      <div
        class="flex flex-col justify-center p-5 bg-gray-50 border border-orange-200 rounded-md text-black z-60"
      >
        <div class="flex justify-between relative mb-3">
          <p class="text-xl">Créer une tâche</p>
          <span
            class="text-2xl cursor-pointer absolute right-[-10px] bottom-4"
            @click="displayModalCreateTast"
          >
            &times;
          </span>
        </div>
        <div class="flex flex-col">
          <label for="title">Titre de la tâche</label>
          <input
            class="rounded-md border border-gray-200 pl-2 focus:outline-orange-300 p-1 mb-2"
            type="text"
            name="title"
          />
          <label for="description">Description</label>
          <input
            class="rounded-md border border-gray-200 pl-2 p-1 focus:outline-orange-300"
            type="text"
            name="description"
          />
          <button
            class="text-black mt-4 bg-green-300 border border-green-400 p-1 w-fit mx-auto rounded-md cursor-pointer"
            @click="displayModalCreateTast"
          >
            Créer la tâche
          </button>
        </div>
      </div>
    </div>
  </section>
</template>

<script setup>
import { ref } from "vue";
const isModalCreateTaskOpen = ref(false);

const displayModalCreateTast = () => {
  isModalCreateTaskOpen.value = !isModalCreateTaskOpen.value;
};
</script>
