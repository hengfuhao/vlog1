<template>
  <v-card>
    <v-card-text>
      <v-row align="center">
        <v-checkbox
          v-model="includeFiles"
          hide-details
          class="shrink mr-2 mt-0"
        ></v-checkbox>
        <v-text-field label="中路被抓了 如何反野"></v-text-field>
      </v-row>
      <v-row align="center">
        <v-checkbox
          v-model="enabled"
          hide-details
          class="shrink mr-2 mt-0"
        ></v-checkbox>
        <v-text-field
          :disabled="!enabled"
          label="好好学习 天天向上"
        ></v-text-field>
      </v-row>
    </v-card-text>
  </v-card>
</template>

<script>
  export default {
    data: () => ({
      includeFiles: true,
      enabled: false,
    }),
  }
</script>

<style>

</style>