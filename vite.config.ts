import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import svgLoader from 'vite-svg-loader'
import path from 'path'


// https://vitejs.dev/config/
export default defineConfig({
  plugins: [vue(), svgLoader({defaultImport: "url", svgoConfig:{multipass:true}, svgo: false})],
  resolve: {
    alias: {
      '@': path.resolve(__dirname, 'src')
    }
  },
  optimizeDeps: {
    include: ['vue-router']
  },

})
