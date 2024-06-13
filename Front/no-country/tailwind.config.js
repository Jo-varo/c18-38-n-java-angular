/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    "./src/**/*.{html,ts}"
  ],
  theme: {
    extend: {
      colors: {
        'custom-pink': '#F279C8',
        'custom-purple': '#26051D',
        'custom-blue': '#7EBFBF',
        'custom-green': '#E2F266',
        'custom-gray': '#F2F2F2',
        "custom-white": "#f1f2ed"
      },
    },
  },
  plugins: [],
}