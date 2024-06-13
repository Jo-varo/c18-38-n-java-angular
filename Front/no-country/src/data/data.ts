import data from './mocks.json';

export const getProducts = data.map((product, i) => ({ id: i + 1, ...product }));
